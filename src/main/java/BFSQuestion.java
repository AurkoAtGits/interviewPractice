package main.java;

import main.java.util.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSQuestion
{
    Queue<Node> queue =  new LinkedList<>();
    ArrayList<String> path = new ArrayList<>();

    public ArrayList<String> BFSImpl(Node root)
    {
        root.setVisited(true);
        path.add(root.getName());
        queue.add(root);
        while (!queue.isEmpty())
        {
            Node node = queue.remove();
            List<Node> children = Arrays.asList(node.getChildren());
            for(Node child : children)
            {
                if(!child.isVisited())
                {
                    child.setVisited(true);
                    path.add(child.getName());
                    queue.add(child);
                }
            }
        }
        return path;
    }
}
