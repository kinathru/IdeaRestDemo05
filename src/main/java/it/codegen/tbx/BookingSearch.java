package it.codegen.tbx;

import it.codegen.tbx.utils.BookingLoaderUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@CrossOrigin
@RestController
public class BookingSearch
{
    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public Booking getBooking( @RequestParam(name = "bookingId", required = true) long bookingId )
    {
        return BookingLoaderUtil.loadBooking( bookingId );
    }

    @RequestMapping(value = "/bookings",method = RequestMethod.GET)
    public ResponseEntity<List<Booking>> listAllBookings()
    {
        List<Booking> listOfBookings = BookingLoaderUtil.listAllBookings();
        return new ResponseEntity<List<Booking>>( listOfBookings,HttpStatus.OK );
    }

    @RequestMapping(value = "/bookingitems/{bookingId}", method = RequestMethod.GET)
    public List<BookingItem> getBookingItems( @PathVariable(value = "bookingId") long bookingId )
    {
        return BookingLoaderUtil.loadBookingItems( bookingId );
    }

    @RequestMapping(value = "/booking/add",method = RequestMethod.POST)
    public ResponseEntity<String> addBooking( @RequestBody Booking booking )
    {
        String response = BookingLoaderUtil.addBooking( booking );
        return new ResponseEntity<String>( response, HttpStatus.OK );
    }

    public ResponseEntity<List<Booking>> searchBookings()
    {
        return null;
    }
}
