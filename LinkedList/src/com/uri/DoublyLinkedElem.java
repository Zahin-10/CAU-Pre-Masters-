package com.uri;

public class DoublyLinkedElem<T> {
    public T value;
    public DoublyLinkedElem next;
    public DoublyLinkedElem prev;
    public static DoublyLinkedElem head;

    DoublyLinkedElem(T value, DoublyLinkedElem prev, DoublyLinkedElem next){
        this.value = value;
        if(next != null)
        {
            next.prev = this;
            this.next = next;
        }else {
            this.next = null;
        }

        if(prev != null){
            prev.next = this;
            this.prev = prev;
        }else{
            this.prev = null;
        }

        if (DoublyLinkedElem.head == null)
        {
            DoublyLinkedElem.head = this;
        }
        else if()
    }

    public void remove(){
        this.prev.next = this.next;
        this.next.prev = this.prev;
    }

    public String to_list(){
        String list = "";

        while (DoublyLinkedElem.head != null){
            list += DoublyLinkedElem.head.value.toString();
            if(head.next != null)
            {
                list+= "<->";
            }
            DoublyLinkedElem.head = DoublyLinkedElem.head.next;
        }
        return list;
    }
}
