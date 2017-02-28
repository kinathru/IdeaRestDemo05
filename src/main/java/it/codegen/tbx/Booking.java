package it.codegen.tbx;

import java.util.ArrayList;
import java.util.List;

public class Booking
{
    private long bookingID;
    private String product;
    List<BookingItem> bookingItems;

    public Booking()
    {
    }

    public Booking( long bookingID, String product, List<BookingItem> bookingItems )
    {
        this.bookingID = bookingID;
        this.product = product;
        this.bookingItems = bookingItems;
    }

    public static enum BookingProduct
    {
        PKG, TMD, DP, EP
    }

    public long getBookingID()
    {
        return bookingID;
    }

    public void setBookingID( long bookingID )
    {
        this.bookingID = bookingID;
    }

    public String getProduct()
    {
        return product;
    }

    public void setProduct( String product )
    {
        this.product = product;
    }

    public List<BookingItem> getBookingItems()
    {
        if( bookingItems == null )
        {
            bookingItems = new ArrayList<BookingItem>();
        }
        return bookingItems;
    }

    public void setBookingItems( List<BookingItem> bookingItems )
    {
        this.bookingItems = bookingItems;
    }
}
