package it.codegen.tbx.search.criteria;

/**
 * Created by kinath on 24/02/2017.
 */
public class BookingSearchCriteria
{
    private int bookingId;
    private int product;

    public int getBookingId()
    {
        return bookingId;
    }

    public void setBookingId( int bookingId )
    {
        this.bookingId = bookingId;
    }

    public int getProduct()
    {
        return product;
    }

    public void setProduct( int product )
    {
        this.product = product;
    }
}
