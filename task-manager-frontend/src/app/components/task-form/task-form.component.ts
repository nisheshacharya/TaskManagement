import { Component } from '@angular/core';
import { TaskService } from '../../services/task.service';
import { Task } from '../../model/task';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-task-form',
  templateUrl: './task-form.component.html',
  imports: [
    FormsModule
  ],
  styleUrls: ['./task-form.component.css']
})
export class TaskFormComponent {
  task: Task = {
    name: '',
    description: '',
    priority: 1,
    completed: false
  };

  constructor(private taskService: TaskService) {}

  addTask(): void {
    this.taskService.addTask(this.task).subscribe(() => {
      alert('Task added successfully!');
      this.task = { name: '', description: '', priority: 1, completed: false };
    });
  }
}
