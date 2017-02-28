package it.codegen.tbx.utils;

import it.codegen.tbx.Booking;
import it.codegen.tbx.BookingItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kinath on 24/02/2017.
 */
public class BookingLoaderUtil
{
    public static List<Booking> bookingList = new ArrayList<Booking>();

    static
    {
        int counter = 10500;

        for( int i = 0; i < 100; i++ )
        {
            Booking booking = new Booking(1,"",null);
            booking.setBookingID( counter++ );
            switch( i % 4 )
            {
                case 0:
                    booking.setProduct( Booking.BookingProduct.PKG.toString() );
                    break;
                case 1:
                    booking.setProduct( Booking.BookingProduct.DP.toString() );
                    break;
                case 2:
                    booking.setProduct( Booking.BookingProduct.EP.toString() );
                    break;
                case 3:
                    booking.setProduct( Booking.BookingProduct.TMD.toString() );
                    break;
            }

            for( int j = 0; j < 3; j++ )
            {
                BookingItem bookingItem = new BookingItem();
                bookingItem.setBookingId( booking.getBookingID() );
                bookingItem.setItemNo( j );

                switch( ( i + j ) % 5 )
                {
                    case 0:
                        bookingItem.setProductCode( BookingItem.ProductType.HTL.toString() );
                        break;
                    case 1:
                        bookingItem.setProductCode( BookingItem.ProductType.FLT.toString() );
                        break;
                    case 2:
                        bookingItem.setProductCode( BookingItem.ProductType.TOU.toString() );
                        break;
                    case 3:
                        bookingItem.setProductCode( BookingItem.ProductType.CAR.toString() );
                        break;
                    case 4:
                        bookingItem.setProductCode( BookingItem.ProductType.GEN.toString() );
                        break;
                }
                booking.getBookingItems().add( bookingItem );
            }

            bookingList.add( booking );
        }
    }

    public static List<Booking> loadBookings()
    {
        return bookingList;
    }

    public static Booking loadBooking( long bookingId )
    {
        for( Booking booking : bookingList )
        {
            if( bookingId == booking.getBookingID() )
            {
                return booking;
            }
        }
        return null;
    }

    public static List<BookingItem> loadBookingItems( long bookingId )
    {
        List<BookingItem> bookingItemList = new ArrayList<BookingItem>();
        for( Booking booking : bookingList )
        {
            if( bookingId == booking.getBookingID() )
            {
                bookingItemList.addAll( booking.getBookingItems() );
            }
        }
        return bookingItemList;
    }

    public static List<Booking> listAllBookings()
    {
        return bookingList;
    }

    public static String addBooking(Booking booking)
    {
        booking.setBookingID( bookingList.get( bookingList.size() - 1 ).getBookingID() + 1 );
        bookingList.add( booking );
        return String.format( "Booking %d Added Successfully", booking.getBookingID() );
    }
}
