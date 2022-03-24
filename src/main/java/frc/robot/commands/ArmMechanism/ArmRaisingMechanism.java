// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.ArmMechanism;


import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class ArmRaisingMechanism extends CommandBase {

  public ArmRaisingMechanism() {
    
    addRequirements(Robot.m_arm);
  }


  @Override
  public void initialize() {}

  @Override
  public void execute() {
    if (! Robot.m_arm.checkArmLimitSwitch() /*&& ! Robot.m_robotContainer.xButton.()*/){
    Robot.m_arm.setArmMotorSpeed(Constants.MotorSpeeds.ArmValues.m_armRaisingMotorSpeed);
    }else{
      Robot.m_arm.setArmMotorSpeed(0);
    }

   
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {

    return false;
 }
}
