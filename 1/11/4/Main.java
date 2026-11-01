Scanner sc = new Scanner(System.in);
int n = sc.nextInt(), m = sc.nextInt();
a = new int[n][m];
for (int i = 0; i < n * m; i++)
    a[i / m][i % m] = (i / m) * (i % m);