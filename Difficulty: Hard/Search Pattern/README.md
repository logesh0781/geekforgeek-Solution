<h2><a href="https://www.geeksforgeeks.org/problems/search-pattern0205/1">Search Pattern</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given two strings, a text string <strong>txt</strong> and a pattern string&nbsp;<strong>pat</strong>,&nbsp;both consisting of lowercase English alphabets. Return the starting <strong>indices</strong> (0-based) of all the occurrences of the pattern string pat in the text string txt.</span></p>
<p><span style="font-size: 14pt;"><strong>Note:&nbsp;</strong>Return an empty list in case of no occurrences of pattern.<br></span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> txt = "geeksforgeeks", pat = "geek"
<strong>Output:</strong> [0, 8]
<strong>Explanation:</strong> The string "geek" occurs twice in txt, one starts at index 0 and the other at index 8.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> txt = "abesdu", pat = "edu"
<strong>Output:</strong> []
<strong>Explanation:</strong> There's no substring "edu" present in txt.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> txt = "aabaacaadaabaaba", pat = "aaba"
<strong>Output:</strong> [0, 9, 12]
<strong>Explanation:</strong><br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/703119/Web/Other/blobid0_1731391225.png" width="377" height="188"><br></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ txt.size() ≤ 10<sup>5</sup><br>1 ≤ pat.size() ≤&nbsp;txt.size()</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<code>Payu</code>&nbsp;<code>MAQ Software</code>&nbsp;<code>Oracle</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Pattern Searching</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;