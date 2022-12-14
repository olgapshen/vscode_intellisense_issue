/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package vscode_intellisense_issue;

import java.util.ArrayList;
import java.util.List;

public class Library
{
    public String someLibraryMethod(String pattern)
    {
        List<String> list = new ArrayList<>();
        list.add("string abc");
        list.add("string abc");
        list.add("string xyx");
        return list
            .stream()
            .takeWhile(l -> l.contains(pattern))
            .findFirst()
            .get();
    }
}
