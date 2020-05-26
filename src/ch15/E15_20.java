package ch15;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* E15.20 Write a program that checks whether a sequence of HTML tags is properly nested.
For each opening tag, such as <p>, there must be a closing tag </p>. A tag such as <p>
may have other tags inside, for example
<p> <ul> <li> </li> </ul> <a> </a> </p>
The inner tags must be closed before the outer ones. Your program should process a
file containing tags. For simplicity, assume that the tags are separated by spaces, and
that there is no text inside the tags.

*/
public class E15_20 {

    public static void main(String[] args) throws Exception {

        String input = "<p> <span> <div> </div> <a> <ul> </ul> </a> </span>";
        Stack<String> tags = new Stack<>();

        Pattern p = Pattern.compile("<(.+?)>");
        Matcher m = p.matcher(input);

        while (m.find()) {
            String tag = m.group(1);
            if (!tag.startsWith("/")) {
                tags.push(tag);
            } else {
                try {
                    String previousTag = tags.peek();
                    if (previousTag != null && previousTag.equals(tag.subSequence(1, tag.length()))) {
                        tags.pop();
                    } else {
                        throw new Exception("Not nested correctly at " + tag);
                    }
                } catch (Exception e) {
                    throw new Exception("Not nested correctly at " + tag);
                }

            }
        }

        if (!tags.empty()) {
            String tag = tags.pop();
            throw new Exception("Not nested correctly at " + tag);
        } else {
            System.out.println("Tags are correctly nested.");
        }

    }
}