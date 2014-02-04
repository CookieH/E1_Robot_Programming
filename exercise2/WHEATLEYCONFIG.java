package exercise2;

import lejos.nxt.Motor;
import lejos.nxt.MotorPort;
import lejos.nxt.NXTRegulatedMotor;

/**
 * Static class for holding the configuration of the almighty Wheatley bot.
 * Accurate measurements of the robot IN MILIMETERS should be place into the
 * final fields to allow this configuration to be accessed in order to save work
 * in putting in measurements repeatedly.
 * 
 * @author david
 * 
 */
public class WHEATLEYCONFIG implements Configuration {

	private static final int length = 999;
	private static final int wheelBase = 999;
	private static final int diameter = 999;
	private static final int wheelDiameter = 999;
	private static final NXTRegulatedMotor left = Motor.C;
	private static final NXTRegulatedMotor right = Motor.B;
	

	/**
	 * Gives in mm the length from front to back of the robot.
	 * 
	 * @return length of the robot
	 */
	public int getLength() {
		// TODO Auto-generated method stub
		return length;
	}

	/**
	 * Gives in mm the wheel base (distance between the central point of the two
	 * wheels) of Wheatley
	 * 
	 * @return the wheel base of the robot
	 */
	public int getWheelBase() {
		// TODO Auto-generated method stub
		return wheelBase;
	}

	/**
	 * Gives in mm the diameter, distance from left most to right most point, of
	 * the robot
	 * 
	 * @return The diameter of the robot
	 */
	public int getDiameter() {
		// TODO Auto-generated method stub
		return diameter;
	}

	/**
	 * Gives the diameter of the wheels in mm. Assumes
	 *         that the wheels on the robot are of the same size
	 * @return Diameter of the robot's wheels 
	 */
	public int getWheelDiameter() {
		// TODO Auto-generated method stub
		return wheelDiameter;
	}

	@Override
	public NXTRegulatedMotor getLeftMotor() {
		// TODO Auto-generated method stub
		return left;
	}

	@Override
	public NXTRegulatedMotor getRightMotor() {
		// TODO Auto-generated method stub
		return right;
	}

}
