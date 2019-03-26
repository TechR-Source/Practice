package exceptions;

public class NoSuchFrameException {

}


/*
NoSuchFrameException

This Exception occurs when the driver is switching to an invalid frame, which is not available.
Example:-

driver.switchTo().frame(invalidindex);
(or)
driver.switchTo().frame("frame_z");


//frame_z is the name of the invalid frame
For frames indexing starts from Zero. Try to access the frame by providing invalid index.

*/