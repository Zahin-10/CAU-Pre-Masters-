package com.uri;

public class DoublyLinkedElem<T> {
    public T value;
    public DoublyLinkedElem next;
    public DoublyLinkedElem prev;
    public static DoublyLinkedElem head;
    public static DoublyLinkedElem traverse;

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
            DoublyLinkedElem.traverse = this;
        }
        else if(prev == null){
            DoublyLinkedElem.head = this;
            DoublyLinkedElem.traverse = this;
        }
    }

    public void remove(){
        if(this.prev != null)
        {
            this.prev.next = this.next;
        }else{
            DoublyLinkedElem.head = this.next;
            DoublyLinkedElem.traverse = this.next;
        }
        if(this.next != null)
        {
            this.next.prev = this.prev;
        }
    }

    public String to_list(){
        String list = "";

        while (DoublyLinkedElem.traverse != null){
            list += DoublyLinkedElem.traverse.value.toString();
            if(DoublyLinkedElem.traverse.next != null)
            {
                list+= "<->";
            }
            DoublyLinkedElem.traverse = DoublyLinkedElem.traverse.next;
        }
        DoublyLinkedElem.traverse = DoublyLinkedElem.head;
        return list;
    }
}
