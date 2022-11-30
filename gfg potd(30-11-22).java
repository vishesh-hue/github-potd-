class Solution{ 
public:
    void reorderList(Node* head) {
       
        // Your code here
        
        //step 1 - using slow and fast pointer 
        Node* slow=head;
        Node* fast=head->next;
        
        while(fast && fast->next)
        {
            slow=slow->next;
            fast=fast->next->next;
        }
        
         //step 2 -  split the List into two.
        Node* List1=head; // 1 2 3
        Node* List2=reverse(slow->next);  // 4 5
        slow->next=NULL;
        
        //step 3 - merging the two list and second list can be shorter 
        while(List2)
        {
            Node* temp1=List1->next;
            Node* temp2=List2->next;
            List1->next=List2;
            List2->next=temp1;
            List1=temp1;
            List2=temp2;
        }
    }
    
    Node* reverse(Node* head)
    {
        Node* prev=NULL;
        Node* curr=head;
        Node* nxt=NULL;
        
        while(curr)
        {
            nxt=curr->next;
            curr->next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
};
