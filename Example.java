package substring;
import java.util.HashSet;

public class Example {
	public static Boolean areDistinct(String str,
            int i, int j)
{


boolean[] visited = new boolean[26];

for(int k = i; k <= j; k++)
{
if (visited[str.charAt(k) - 'a'] == true)
	
return false;

visited[str.charAt(k) - 'a'] = true;
}
return true;
}


public static int longestUniqueSubsttr(String str)
{
int n = str.length();


int res = 0;

for(int i = 0; i < n; i++)
for(int j = i; j < n; j++)
if (areDistinct(str, i, j))
res = Math.max(res, j - i + 1);

return res;
}


}
