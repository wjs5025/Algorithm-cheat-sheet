private static boolean dfs(int x, int y) {
        if(y==n) {
            return true;
        }
        if (x < 0 || n <= x || y < 0 || m <= y) {
            return false;
        }
        
        int[] dx = {-1,0,1};
        int[] dy = {1,1,1}; 
        
        if (arr[x][y] == 0) {
            arr[x][y] = 1;
            for(int i=0;i<3;i++) {
                dfs(x + dx[i], y + dy[i]);
            }
            return true;
        }
        return false;
    }
