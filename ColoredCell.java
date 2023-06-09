package GarbageCollector;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class ColoredCell extends Cell
{
    private boolean filled;
    private Color color;

    public ColoredCell()
    {
        super(5,5,5,5);
        setFilled(false);
        setColor(Color.BLUE);
    }

    public ColoredCell(boolean fill)
    {
        setFilled(fill);
        setColor(Color.BLUE);
    }

    public ColoredCell(int x, int y, boolean fill)
    {
        super(x, y);
        setFilled(fill);
        setColor(Color.BLUE);
    }

    public ColoredCell(int x, int y, int w, int h, boolean fill)
    {
        super(x, y, w, h);
        setFilled(fill);
        setColor(Color.BLUE);
    }

    public ColoredCell(int x, int y, int w, int h, boolean fill, Color c)
    {
        super(x, y, w, h);
        setFilled(fill);
        setColor(c);
    }

    public void setFilled(boolean fill)
    {
        filled = fill;
    }

    public void setColor(Color c)
    {
        color = c;
    }

    public boolean getFilled()
    {
        return filled;
    }

    public Color getColor()
    {
        return color;
    }

    public void draw(Graphics window) {
        window.setFont(new Font("TAHOMA", Font.BOLD, 28));
        window.setColor(getColor());
        if (filled == true) {
            window.fillRect(getX(), getY(), getWidth(), getHeight());
            window.setColor(Color.ORANGE);
        }
        window.drawRect(getX(), getY(), getWidth(), getHeight());

    }
    public String toString()
    {
        return super.toString() + " " + getFilled() + " " + getColor();
    }
}