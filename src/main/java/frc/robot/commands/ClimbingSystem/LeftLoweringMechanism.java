// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.ClimbingSystem;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class LeftLoweringMechanism extends CommandBase {
  
  
  public LeftLoweringMechanism() {

    addRequirements(Robot.m_climber);
  }

  
  @Override
  public void initialize() {

  }

  
  @Override
  public void execute() {
    Robot.m_climber.setLeftClimberMotorSpeed(Constants.MotorSpeeds.Climbervalues.m_leftMotorSpeed);
  }

  
  @Override
  public void end(boolean interrupted) {}

  
  @Override
  public boolean isFinished() {
   
    return false;
  }
}
