// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.commands.MecanumDriver;
import frc.robot.commands.ArmMechanism.ArmLoweringMechanism;
import frc.robot.commands.IntakeShooterSystem.Intake;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.IntakeShooter;


public class Robot extends TimedRobot {
 
 //Establishing instances of nessesarry classes 

 public static MecanumDrive m_robotDrive;
 
 public static DriveTrain m_driveTrain = new DriveTrain();
 public static IntakeShooter m_intakeShooter = new IntakeShooter();

 public static Climber m_climber = new Climber();

 public static Arm m_arm = new Arm();

 public static MecanumDriver m_mecanumDriver = new MecanumDriver();
 public static Intake  m_intake = new Intake();
 public static ArmLoweringMechanism m_armLoweringMechanism = new ArmLoweringMechanism();

 private Command m_autonomousCommand;
  
 public static RobotContainer m_robotContainer = new RobotContainer();
  
 
  @Override
  public void robotInit() {
    // Instantiate our RobotContainer.  This will perform all our button bindings, and put our
    // autonomous chooser on the dashboard.
    m_robotContainer = new RobotContainer();
  }
 
  @Override
  public void robotPeriodic() {
  
    CommandScheduler.getInstance().run();
  }

  /** This function is called once each time the robot enters Disabled mode. */
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_robotContainer.getAutonomousCommand();

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.schedule();
    }
  }

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    
    CommandScheduler.getInstance().cancelAll();
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    

  }

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}
}
