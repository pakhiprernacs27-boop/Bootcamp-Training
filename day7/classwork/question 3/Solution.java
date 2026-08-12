//print number from 1 to N
static void print(int n) {
    if (n == 0)
        return;

    print(n - 1);
    System.out.println(n);
}