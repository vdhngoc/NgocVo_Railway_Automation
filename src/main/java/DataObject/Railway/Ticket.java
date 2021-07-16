package DataObject.Railway;

import Common.Constant.Constant;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ticket {
    String departdate;
    String departstation;
    String arrivestation;
    String seattype;
    String ticketamount;

    public Ticket(){
        this.departdate = Constant.BOOK_TICKET_DEPART_DATE;
        this.departstation = Constant.BOOK_TICKET_DEPART_STATION;
        this.arrivestation = Constant.BOOK_TICKET_ARRIVE_STATION;
        this.seattype = Constant.BOOK_TICKET_SEAT_TYPE;
        this.ticketamount = Constant.BOOK_TICKET_TICKET_AMOUNT;
    }
<<<<<<< HEAD

=======
>>>>>>> b21bfabcda3a46a8836ba4764d6af32750baa365
}
