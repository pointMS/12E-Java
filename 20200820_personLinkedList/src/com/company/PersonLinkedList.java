package com.company;

public class PersonLinkedList {
    private Node start=null;
    private Node finish=null;
    private int size=0;

    public void add(Person person){
        Node node= new Node(person);
        if(start==null){
            start=node;
        } else {
            node.setPrev(finish);
            finish.setNext(node);
        }
        finish=node;
        size++;
    }

    public void remove(){
        if(finish!=null){
            finish.setPerson(null);
            if(finish==start){
                finish=null;
                start=null;
                size=0;
            } else {
                finish=finish.getPrev();
                finish.getNext().setPrev(null);
                finish.setNext(null);
                size--;
            }
        }
    }

    public void remove(int index){
        if(index>0 && index<size){
            if(index==size-1){
                remove();
                return;
            }
            if(index==0){
                start=start.getNext();
                start.getPrev().setNext(null);
                start.setPrev(null);
                size--;
                return;
            }
            Node node=getNodeByIndex(index);
            if (node!=null){
               node.getPrev().setNext(node.getNext());
               node.getNext().setPrev(node.getPrev());
               node.setPrev(null);
               node.setNext(null);
               node.setPerson(null);
            }

        }
    }

    private Node getNodeByIndex(int index) {
        int i=0;
        Node currentNode=start;
        while (currentNode!=null){
            if(i==index){
                return currentNode;
            }
            i++;
            currentNode=currentNode.getNext();
        }
        return null;
    }

    public String toString(){
        Node currentNode=start;
        String resString="";
        while (currentNode!=null){
            resString+=currentNode.getPerson().toString()+'\n';
            currentNode=currentNode.getNext();
        }
        return resString;

    }

    public int find(Person person){
        Node currentNode=start;
        int res=-1;
        int index=0;
        while (currentNode!=null){
            if(currentNode.getPerson().equals(person)){
                res=index;
                break;
            } else {
                currentNode=currentNode.getNext();
                index++;
            }
        }
        return res;
    }

    public Node getStart() {
        return start;
    }

    public Node getFinish() {
        return finish;
    }

    public int getSize() {
        return size;
    }

}
