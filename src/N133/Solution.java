package N133;

import util.UndirectedGraphNode;

import java.util.HashMap;

public class Solution {
    public HashMap<Integer,UndirectedGraphNode> h= new HashMap<>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return helper(node);
    }
    public UndirectedGraphNode helper(UndirectedGraphNode node){
        if(node==null)
            return null;
        if(h.containsKey(node.label)){
            return new UndirectedGraphNode(node.label);
        }
        UndirectedGraphNode res = new UndirectedGraphNode(node.label);
        h.put(res.label,res); //important
        for (int i = 0; i < node.neighbors.size(); i++) {
            UndirectedGraphNode tmp = node.neighbors.get(i);
            res.neighbors.add(helper(tmp));
        }
        return res;
    }
}
