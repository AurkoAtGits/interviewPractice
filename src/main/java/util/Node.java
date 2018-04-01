package main.java.util;

public class Node
{
    String name;
    Node [] children;
    boolean isVisited;

    public Node (String name)
    {
        isVisited = false;
        setName(name);
    }

    public Node(String name, Node[] children)
    {
        isVisited = false;
        this.name = name;
        this.children = children;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Node[] getChildren ()
    {
        return children;
    }

    public boolean isVisited ()
    {
        return isVisited;
    }

    public void setVisited (boolean visited)
    {
        isVisited = visited;
    }
}
