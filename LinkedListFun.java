import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListFun {




    static Node<Integer> insertNode(Node<Integer> head,Integer pos,Integer data){
        Node<Integer> temp=head;
        Node<Integer> newNode=new Node<Integer>(data);

        if(pos==0){ 
            newNode.next=head;
            return newNode;
        }
        int i=0;
        while(i<=pos-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
        

    }


    static void deleteNode(Node<Integer> head,Integer pos){
        Node<Integer> temp=head;
        int i=0;
        while(i<=pos-1){
           temp=temp.next;
           i++;
        }
        if(temp.next!=null)temp.next=temp.next.next;
       
    
    }



    public static void main(String[] args) {
        
    } 
    
    
   
}

