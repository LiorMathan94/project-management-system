package projectManagementSystem.entity.DTO;

import projectManagementSystem.entity.Importance;
import projectManagementSystem.entity.Item;

import java.time.LocalDate;

public class ItemDTO {
    private long id;
    private long boardId;
    private String status;
    private String type;
    private long parentId;
    private long creatorId;
    private long assignedToId;
    private LocalDate dueDate;
    private Importance importance;
    private String title;
    private String description;

    public ItemDTO(Item item) {
        this.id = item.getId();
        this.boardId = item.getBoardId();
        this.status = item.getStatus();
        this.type = item.getType();
        this.parentId = item.getParent() == null ? 0 : item.getParent().getId();
        this.creatorId = item.getCreatorId();
        this.assignedToId = item.getAssignedToId();
        this.dueDate = item.getDueDate();
        this.importance = item.getImportance();
        this.title = item.getTitle();
        this.description = item.getDescription();
    }

    public long getId() {
        return id;
    }

    public long getBoardId() {
        return boardId;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public long getParentId() {
        return parentId;
    }

    public long getCreatorId() {
        return creatorId;
    }

    public long getAssignedToId() {
        return assignedToId;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Importance getImportance() {
        return importance;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
