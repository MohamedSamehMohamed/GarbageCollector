package GarbageCollector;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Grid
{
    private Cell[][] grid;

    public Grid()
    {
        setSize(0,0);
    }

    public Grid(int rows, int cols)
    {
        setSize(rows, cols);
    }
    public void setSize(int rows, int cols)
    {
        grid = new ColoredCell[rows][cols];
    }

    public void setSpot(int row,int col, Cell val)
    {
        grid[row][col] = val;
    }

    public Cell getSpot(int row, int col)
    {
        return grid[row][col];
    }

    public int getNumRows()
    {
        return grid.length;
    }

    public int getNumCols()
    {
        return grid[0].length;
    }

    public boolean drawGrid(Graphics window)
    {
        boolean full=true;
        //for loop for row
        for(int r=0;r<grid.length;r++)
        {
            //for loop for col
            for(int c=0;c<grid[r].length;c++)
            {
                Cell spot = grid[r][c];
                //if the current spot is not null
                if (spot != null) {
                    grid[r][c].draw(window);
                }
                else {
                    full = false;
                }
            }
        }
        return full;
    }

    public String toString()
    {
        String output="";
        //for loop for row
        for (int r = 0; r < grid.length; r++){
            //for loop for col
            for (int c = 0; c < grid[r].length; c++){
                output += grid[r][c];
                if (c + 1 < grid[r].length)
                    output += " ";
            }
            output += "\n";
        }
        return output;
    }

}