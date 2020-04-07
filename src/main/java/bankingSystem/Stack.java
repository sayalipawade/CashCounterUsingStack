package bankingSystem;
public class Stack
{
    int top;
    int size, max,item;
    int[] array = new int[size];
    Stack()                                                 //created constructor
    {
        max=0;
        top=0;
        size = 0;
    }
    public boolean isFull(Stack stack)                      //Method to checking stack is full or not
    {
        if(size==max)
        {
            return true;
        }
        return false;
    }
    public boolean isEmpty(Stack stack)                     //Method to checking stack is empty or not
    {
        if(size==0)
        {
            return true;
        }
        return false;
    }
    public void push(int item)                              //Method to add the elements in stack
    {
        if (isFull(this))
        {
            return;
        }
        else
        {
            array[top]=item;
            top=top+1;
            size++;
        }
    }
    public int pop()                                         //Method to pop the element from the stack
    {
        if (isEmpty(this))
        {
            return 0;
        }
        else
        {
            item = array[top];
            top=top-1;
            size--;
            return item;
        }
    }
}
