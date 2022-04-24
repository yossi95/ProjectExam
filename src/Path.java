import java.util.List;

public class Path {

    public static boolean searchPath(int[][] maze, int x, int y
            , List<Integer> path) {

        if (maze[y][x] == 9) {
            path.add(x);
            path.add(y);
            return true;
        }

        if (maze[y][x] == 0) {
            maze[y][x] = 2;

            int x1 = -1;
            int y2 = 0;
            if (searchPath(maze, x + x1, y + y2, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            x1 = 1;
            y2 = 0;
            if (searchPath(maze, x + x1, y + y2, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            x1 = 0;
            y2 = -1;
            if (searchPath(maze, x + x1, y + y2, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            x1 = 0;
            y2 = 1;
            if (searchPath(maze, x + x1, y + y2, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }

}