class Solution {
public:
    int index = 0;
    
    int calculate(string& s) {
        int result = 0, temp = 0;
        char digits = '&';
        bool isFinish = false;
        while(index < s.size() && !isFinish) {
            if(s[index] == '+' || s[index] == '-') {
                if(digits == '-') temp *= -1;
                result += temp;
                digits = s[index];
                temp = 0;
                index++;
            }
            else if(s[index] == '(') {
                index++;
                temp = calculate(s);
                if(digits == '-') temp *= -1;
                result += temp;
                temp = 0;
                digits = '&';
            }
            else if(s[index] == ')') {
                if(digits == '-') temp *= -1;
                result += temp;
                temp = 0;
                digits = '&';
                isFinish = true;
                index++;
            }
            else if(s[index] != ' ') {
                if(temp != 0) temp *= 10;
                temp += (s[index] - '0');
                index++;
            }
            else index++;
        }
        if(index == s.size() && temp != 0) {
            if(digits == '-') temp *= -1;
            result += temp;
        }
        return result;
    }
};
