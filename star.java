class star
{
    public static void main(String[] args)
    {
        int n=5;
        for(int r=1;r<=3;r++)
        {
            for(int c=1;c<n-r;c++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}