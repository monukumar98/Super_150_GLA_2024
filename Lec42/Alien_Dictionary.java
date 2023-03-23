package Lec42;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Alien_Dictionary {
	class Solution {
		public String alienOrder(String[] words) {
			HashMap<Character, List<Character>> map = new HashMap<>();
			for (int i = 0; i < words.length; i++) {
				String s = words[i];
				for (int j = 0; j < s.length(); j++) {
					if (!map.containsKey(s.charAt(j))) {
						map.put(s.charAt(j), new ArrayList<>());
					}
				}
			}
			for (int i = 0; i < words.length - 1; i++) {
				String s1 = words[i];
				String s2 = words[i + 1];
				if (s1.startsWith(s2) && s1.length() > s2.length()) {
					return "";
				}
				for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
					if (s1.charAt(j) != s2.charAt(j)) {
						map.get(s1.charAt(j)).add(s2.charAt(j));
						break;
					}

				}
			}
			return TopologicalSort(map);

		}

		public String TopologicalSort(HashMap<Character, List<Character>> map) {
			int[] in = Indegre(map);
			StringBuilder sb = new StringBuilder();
			Queue<Character> q = new LinkedList<>();
			for (char ch : map.keySet()) {
				if (in[ch - 'a'] == 0) {
					q.add(ch);
				}

			}
			int count = 0;
			while (!q.isEmpty()) {
				char ch = q.remove();
				count++;
				sb.append(ch);
				for (char nbrs : map.get(ch)) {
					in[nbrs - 'a']--;
					if (in[nbrs - 'a'] == 0) {
						q.add(nbrs);
					}
				}
			}
			return map.size() == count ? sb.toString() : "";

		}

		public int[] Indegre(HashMap<Character, List<Character>> map) {
			int[] in = new int[26];
			for (char key : map.keySet()) {
				for (char nbrs : map.get(key)) {
					in[nbrs - 'a']++;
				}
			}
			return in;
		}
	}
}
