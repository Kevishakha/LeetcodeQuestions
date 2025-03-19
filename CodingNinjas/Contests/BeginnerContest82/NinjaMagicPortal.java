// Ninja and Magic Portal
// Moderate
// 0/80
// Problem statement
// Ninja finds himself in a matrix of size ‘N’ × ‘M’, where the rows are numbered from 1 to ‘N’ and the columns from 1 to ‘M’. Each cell in this matrix contains a unique portal with a value denoted as ‘PV[i][j]’.
// The Ninja can use the portal in his current cell to teleport to another cell, but only under certain conditions.
// If the Ninja is in cell (X, Y), he can teleport to any cell (i, j) if and only if ‘(i - X) + (j - Y) = PV[X][Y]’.
// The teleportation is possible only within the matrix boundaries, i.e., 1 <= i <= N and 1 <= j <= M.
// Among these portals, there is one magical portal located at cell (Mx, My), which serves as the escape point. The Ninja, currently at cell (Sx, Sy), aims to reach this magic portal in the minimum possible time.
// However, it’s important to note that he only needs to reach the magic portal, not use it.
// Return the minimum number of portals needed to reach the magic portal if possible; otherwise, return -1.

