package main.java;

import main.java.util.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DFSQuestion
{
    Stack<Node> stack =  new Stack<Node>();
    ArrayList<String> path = new ArrayList<>();

    public ArrayList<String> implementDFS(Node root)
    {
        root.setVisited(true);
        path.add(root.getName());
        stack.push(root);
        while (!stack.empty())
        {
            Node node = stack.pop();
            if(!node.isVisited())
            {
                node.setVisited(true);
                path.add(node.getName());
            }
            if(node.getChildren() == null)
                continue;
            List<Node> childrenList = Arrays.asList(node.getChildren());
            for(Node child : childrenList)
            {
                stack.push(child);
            }
        }
        return path;
    }
}
