import java.util.ArrayList;
import java.util.List;

public class AllSubsets {
	
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		new AllSubsets(list);
	}
	
	public AllSubsets(List<Integer> list){
		List<List<Integer>> subSetList = new ArrayList<>();
		populateSubsets(subSetList, list);
		System.out.println(subSetList);
	}
	
	private void populateSubsets(List<List<Integer>> subSetList, List<Integer> list){
		if(list.isEmpty()){
			subSetList.add(new ArrayList<>());
			return;
		}
		
		int curr = list.get(0);
		list.remove(0);
		
		populateSubsets(subSetList, list);
		
		List<List<Integer>> newList = new ArrayList<>();
		newList.addAll(subSetList);
		for(List<Integer> subset: newList){
			List<Integer> newSubset = new ArrayList<>();
			newSubset.addAll(subset);
			newSubset.add(curr);
			
			subSetList.add(newSubset);
		}
	}

}
