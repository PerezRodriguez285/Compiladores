/////////////////////////////////////////////////////////////////////////////////////////////////

int main(){
int 18;
}

/////////////////////////////////////////////////////////////////////////////////////////////////

public class DSCOrdenDeVariables
{
    void DetectaOrden(int a,int b,int c)
    {
        if (a<b && b<c)
            System.out.println("Las variables estan en orden CRECIENTE");
        else if (a>b && b>c)
            System.out.println("Las variables estan en orden DECRECIENTE");
        else
            System.out.println("Las variables estan en DESORDEN");
    }
 /////////////////////////////////////////////////////////////////////////////////////////////////
 
    public static void main(String[] args)
    {
        int a=0,b=0,c=0;
 
        DSCOrdenDeVariables variable = new DSCOrdenDeVariables();
        if(args.length<3)
            System.out.println("Debe ingresar 3 variables");
        else
        {   
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            c=Integer.parseInt(args[2]);        
            variable.DetectaOrden(a,b,c);
        }   
         
    }
}