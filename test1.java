class max{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int max;
if(a>b){
	if(a>c){
		max=a;
		}
	else{
		max=c;
		}
	}
else{
	if(b>c){
		max=b;
		}
	else{
		max=c;
		}
	}
System.out.println(max);
}}