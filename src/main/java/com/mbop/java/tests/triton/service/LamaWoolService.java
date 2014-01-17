package com.mbop.java.tests.triton.service;

import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import static org.mockito.Mockito.*;

/**
 * In this class, we are using a Mockito spy object that returns 
 * true every time the isBefore method is called on it regardless
 * of what date object is passed. This will ensure our the {@link LamaWoolServiceTest}
 * is idempotent.
 */
public class LamaWoolService implements LamaService {

	public boolean isWoolTooOldToSell(DateTime searchDate) {

		ReadableInstant now = new MutableDateTime();
		ReadableInstant spyReadableInstant = spy(now);
		
		when(spyReadableInstant.isBefore(searchDate)).thenReturn(true);
		
		((MutableDateTime) spyReadableInstant).addDays(-10);
		return spyReadableInstant.isBefore(searchDate);
	}

}
