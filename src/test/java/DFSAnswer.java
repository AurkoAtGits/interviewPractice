package test.java;

import main.java.DFSQuestion;
import main.java.util.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFSAnswer
{
    @Test
    public void testDFSImplementation()
    {
        Node node6 = new Node("6");
        Node node4 = new Node("4");
        Node node7 = new Node("7");
        Node node5 = new Node("5");
        Node node3 = new Node("3", new Node[]{node5, node6});
        Node node2 = new Node("2", new Node[]{node4, node5});
        Node node1 = new Node("1", new Node[]{node2, node3, node7});

        DFSQuestion dfsQuestion = new DFSQuestion();
        ArrayList<String> path = dfsQuestion.implementDFS(node1);
        ArrayList<String> expectedPath = new ArrayList<>(Arrays.asList("1","7","3","6","5","2","4"));
        Assert.assertEquals(expectedPath, path);
    }
}
