package switchcase;

public class WeekDay {

	public String getWeekDay(String day){
		String taskToDo = " ";
		day = day.toUpperCase();
		switch(day){
		
		case "MONDAY": taskToDo = "Start with CodeLab"; break;
		case "TUESDAY": taskToDo = " Join Mentoring Session-1 by Jawad Newaj";break;
		case "WEDNESDAY": taskToDo = "Join mentoring session-2 with Kaya Begum";break;
		case "THURSDAY": taskToDo = "Home Work is due";break;
		case "FRIDAY": taskToDo = "Prepare for the quiz";break;
		case "SATURDAY": taskToDo = "Our java class is on session";break;
		case "SUNDAY": taskToDo = "Review of code lab assignment";break;
		default: taskToDo = "Out of Week Days"; break;
		
		}
		return taskToDo;
		}
		
	}

