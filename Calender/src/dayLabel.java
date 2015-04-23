
import javax.swing.JLabel;

/*
 * this is a speical button in calendar
 */

/**
 *
 * @author Ken
 */
public class dayLabel extends JLabel
{
 private boolean selected;
 private int year;
 private int month;
 private int date;
 private int event;

    /**
     *constructor that takes dates, and text
     * @param text
     * @param year
     * @param month
     * @param date
     */
    public dayLabel(String text,int year,int month,int date)
    {
        super(text);
        this.year=year;
        this.month=month;
        this.date=date;
        selected=false;
    }
    
    /**
     * show if the button is selected
     * @return true is selected false otherwise
     */
    public boolean isSelected()
    {
        return selected;
    }

    /**
     *set it to selected/nonselected
     * @param select true of false
     */
    public void setSelect(boolean select)
    {
        selected=select;
        
    }
    
    /**
     *get year
     * @return year
     */
    public int getYear()
    {
        return this.year;
        
    }

    /**
     *get month 
     * @return month
     */
    public int getMonth()
    {
        return this.month;
        
    }
    
    /**
     *get date
     * @return
     */
    public int getDate()
    {
        return this.date;
    }
    
}
