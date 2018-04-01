package main.java.util;

import java.util.Map;

public class Graph
{
    public Map<String, Node> getGraphMap ()
    {
        return graphMap;
    }

    public void setGraphMap (Map<String, Node> graphMap)
    {
        this.graphMap = graphMap;
    }

    Map<String, Node> graphMap;

    public Graph(Map graphMap)
    {
        this.graphMap = graphMap;
    }
}
