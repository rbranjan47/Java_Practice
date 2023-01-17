package javaRegex;

import java.util.regex.*;

/*
 * MatchResult Interface:
 *   > Gives result of a match operations
 *   
 *   > 7 methods:
 *     - end()           >> return last offset, after the last matched character, thorws IllegalStateException & IndexOutofBoundException
 *     - end(int group)  >> return offset, after the last character of the subsequence matched from group, thorws IllegalStateException
 *     - group()         >> return input subsequence matched by the previous match, thorws IllegalStateException & IndexOutofBoundException 
 *     - group(int group)>> return the input subsequence captured by the given group during the previous match
 *     - groupCount()    >> return the number of capturing groups 
 *     - start()         >> return the start index, thorws IllegalStateException & IndexOutofBoundException  
 *     - start(int group)>> return the start index of the subsequence captured by the given group 
 */

class matchResultInterfaceImplement implements MatchResult {

	String regexWord = "_";
	String actualWord = "_hello_world_welcome_message_in_coding";

	Pattern patterns = Pattern.compile(regexWord);
	Matcher matches = patterns.matcher(actualWord);

	@Override
	public int start() {
		return matches.start();
	}

	@Override
	public int start(int group) {
		int startsGroup = matches.start(group);
		return startsGroup;
	}

	@Override
	public int end() {
		int endsAt = matches.end();
		return endsAt;
	}

	@Override
	public int end(int group) {
		int endsGroup = matches.end(group);
		return endsGroup;
	}

	@Override
	public String group() {
		String matchesGroup = matches.group();
		return matchesGroup;
	}

	@Override
	public String group(int group) {
		String matchesGroupUpto = matches.group(group);
		return matchesGroupUpto;
	}

	@Override
	public int groupCount() {
		int matchesGroupUpto = matches.groupCount();
		return matchesGroupUpto;
	}
}

public class matchResultInterfaceRun {

	public static void main(String[] args) {
		matchResultInterfaceImplement matchedResults = new matchResultInterfaceImplement();
		try {
			System.out.println("starts at: " + matchedResults.start());
		} catch (PatternSyntaxException e) {
			System.out.println(e.getDescription() + e.getIndex() + e.getMessage());
		}
	}

}
