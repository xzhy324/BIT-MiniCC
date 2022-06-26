int f(int n){
    if(n==1)return 1;
    return n*f(n-1);
}

int main(){
    int i = 1;
    int a;
    k1:a = f(i);
    i++;
    if(i==4)return 0;
    goto k1;
    return 0;
}
