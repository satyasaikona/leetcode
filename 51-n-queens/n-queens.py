
class Solution(object):
    def solveNQueens(self, n):
        result = []
        board = [["."] * n for _ in range(n)]
        def is_safe(row, col):
            for j in range(col):
                if board[row][j] == "Q":
                    return False
            i, j = row - 1, col - 1
            while i >= 0 and j >= 0:
                if board[i][j] == "Q":
                    return False
                i -= 1
                j -= 1
            i, j = row + 1, col - 1
            while i < n and j >= 0:
                if board[i][j] == "Q":
                    return False
                i += 1
                j -= 1
            return True
        def backtrack(col):
            if col == n:
                result.append(["".join(row) for row in board])
                return
            for row in range(n):
                if is_safe(row, col):
                    board[row][col] = "Q"
                    backtrack(col + 1)
                    board[row][col] = "."

        backtrack(0)
        return result