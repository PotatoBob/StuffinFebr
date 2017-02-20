import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
	static int findBrokenEgg(List<String> a) {
		int ans = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).equals("cracked")) {
				ans = i;
				break;
			}
		}
		return ans;
	}

	static int countPearls(List<Boolean> b) {
		int pears = 0;
		for (int i = 0; i < b.size(); i++) {
			if (b.get(i).equals(true)) {
				pears++;
			}
		}
		return pears;
	}

	static double findTallest(List<Double> d) {
		double height = 0;
		for (double e : d) {
			if (e > height)
				height = e;
		}
		return height;
	}

	static String findLongestWord(List<String> s) {
		String longest = "";
		for (String t : s) {
			if (t.length() > longest.length()) {
				longest = t;
			}
		}
		return longest;
	}

	static boolean containsSOS(List<String> j) {
		if (j.contains(" ... --- ... "))
			return true;
		else
			return false;
	}

	static ArrayList<Double> sortScores(List<Double> k) {
		double temp = 0;
		Double[] ans = (Double[]) k.toArray();
		for (int i = 0; i < ans.length; i++) {
			for (int j = i + 1; j < ans.length; j++) {
				if (ans[i] > ans[j]) {
					temp = ans[i];
					ans[i] = ans[j];
					ans[j] = temp;
				}
			}
		}
		ArrayList<Double> sol = new ArrayList<Double>(Arrays.asList(ans));
		return sol;
	}

	static ArrayList<String> sortDNA(List<String> v) {
		String temp = "";
		String[] ans = (String[]) v.toArray();
		for (int i = 0; i < ans.length; i++) {
			for (int j = i + 1; j < ans.length; j++) {
				if (ans[i].length() > ans[j].length()) {
					temp = ans[i];
					ans[i] = ans[j];
					ans[j] = temp;
				}
			}
		}
		ArrayList<String> sol = new ArrayList<String>(Arrays.asList(ans));
		return sol;
	}

	static ArrayList<String> sortWords(List<String> q) {
		String temp = "";
		String[] ans = (String[]) q.toArray();
		for (int i = 0; i < ans.length; i++) {
			for (int j = i + 1; j < ans.length; j++) {
				if (ans[i].compareTo(ans[j]) > 0) {
					temp = ans[i];
					ans[i] = ans[j];
					ans[j] = temp;
				}
			}
		}
		ArrayList<String> sol = new ArrayList<String>(Arrays.asList(ans));
		return sol;
	}
}
