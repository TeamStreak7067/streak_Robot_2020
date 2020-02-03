/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
/**
 * Add your docs here.
 */
public class ClimbSystem extends Subsystem {
  public WPI_TalonSRX ClimbUp;
  public WPI_TalonSRX ClimbUp2;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

public ClimbSystem(){
  ClimbUp = new WPI_TalonSRX(RobotMap.FalconClimbMotor1.value);
  ClimbUp2 = new WPI_TalonSRX(RobotMap.FalconClimbMotor2.value);
}

public void SetSpeed(double UpSide, double UpSide2){
  ClimbUp.set(UpSide);
  ClimbUp2.set(UpSide2);
}
public double getposition(){
return ClimbUp2.getSelectedSensorPosition();
}
public void resetEncoder1(){
  this.ClimbUp2.setSelectedSensorPosition(0, 0, 100);
}
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
