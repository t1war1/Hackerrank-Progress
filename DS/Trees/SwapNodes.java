import java.util.Scanner;
 

 
 int l=new int[1000];
int r=new int[1000];
int d=new int[1000];
int n,t,k;

public static void depth(int cur, int depth)
{
    d[cur] = depth;
    if (l[cur] > 0) 
	depth(l[cur], depth + 1);
    if (r[cur] > 0) 
	depth(r[cur], depth + 1);
}
 

public static void in_order(int cur)
{
    if (l[cur] > 0) 
	inorder(l[cur]);
    System.out.println(cur+" ");
    if (r[cur] > 0) 
	inorder(r[cur]);
}
 

public static void main(String[] args)
{

    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for (int i = 1; i <= n; i++) {
	l[i]=s.nextInt();
	r[i]=s.nextInt();
    }
 
    calc_depth(1, 1);
 
   t=s.nextInt();
    while (t--) {
        k=s.nextInt();
 
        for (int i = 1; i <= n; i++) {
            if (d[i] % k == 0) {
                swap(l[i], r[i]);
            }
        }
 

        in_order(1);
    }

}
