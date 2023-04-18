

static boolean isAnagram(String a, String b) {
    if(a.length()!=b.length())
    return false;
    a=a.toLowerCase();
    b=b.toLowerCase();
    int sum=0;
    for(char c='a';c<='z';c++)
    {
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==c)
            sum=sum+1;
            if(b.charAt(i)==c)
            sum=sum-1;
            
        }
        if(sum!=0)
        return false;
    }
    return true;
    // Complete the function
}


