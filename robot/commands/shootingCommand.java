/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;    //may the force be with you, young programmer

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/*
public class shootingCommand extends Command {
  public shootingCommand() {
    requires(Robot.shootingSystem);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
   if(Robot.oi.getSecondJoystick().getRawButton(8)){
      Robot.shootingSystem.setSpeed(-0.5, 0.5);
     

    }else if(Robot.oi.getSecondJoystick().getRawButton(7)){
      Robot.shootingSystem.setSpeed(0.5, -0.5);
    }
    else {
   
      Robot.shootingSystem.setSpeed(0, 0);
    }

    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  Robot.shootingSystem.setSpeed(0, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }
}
*/
