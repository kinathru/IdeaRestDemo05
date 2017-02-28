package it.codegen.tbx;

/**
 * Created by kinath on 24/02/2017.
 */
public class BookingItem
{
    private long bookingId;
    private String productCode;
    private int itemNo;

    public static enum ProductType
    {
        HTL, TOU, FLT, GEN, CAR
    };

    public long getBookingId()
    {
        return bookingId;
    }

    public void setBookingId( long bookingId )
    {
        this.bookingId = bookingId;
    }

    public String getProductCode()
    {
        return productCode;
    }

    public void setProductCode( String productCode )
    {
        this.productCode = productCode;
    }

    public int getItemNo()
    {
        return itemNo;
    }

    public void setItemNo( int itemNo )
    {
        this.itemNo = itemNo;
    }
}
