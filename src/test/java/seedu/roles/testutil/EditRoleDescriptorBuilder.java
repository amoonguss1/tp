package seedu.roles.testutil;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import seedu.roles.logic.commands.EditCommand.EditRoleDescriptor;
import seedu.roles.model.job.Company;
import seedu.roles.model.job.Deadline;
import seedu.roles.model.job.Email;
import seedu.roles.model.job.Experience;
import seedu.roles.model.job.JobDescription;
import seedu.roles.model.job.Name;
import seedu.roles.model.job.Phone;
import seedu.roles.model.job.Role;
import seedu.roles.model.job.Salary;
import seedu.roles.model.job.Website;
import seedu.roles.model.util.tag.Tag;

/**
 * A utility class to help with building EditRoleDescriptor objects.
 */
public class EditRoleDescriptorBuilder {

    private EditRoleDescriptor descriptor;

    public EditRoleDescriptorBuilder() {
        descriptor = new EditRoleDescriptor();
    }

    public EditRoleDescriptorBuilder(EditRoleDescriptor descriptor) {
        this.descriptor = new EditRoleDescriptor(descriptor);
    }

    /**
     * Returns an {@code EditRoleDescriptor} with fields containing {@code role}'s details
     */
    public EditRoleDescriptorBuilder(Role role) {
        descriptor = new EditRoleDescriptor();
        descriptor.setName(role.getName());
        descriptor.setPhone(role.getPhone());
        descriptor.setEmail(role.getEmail());
        descriptor.setCompany(role.getCompany());
        descriptor.setJobDescription(role.getJobDescription());
        //descriptor.setWebsite(role.getWebsite());
        descriptor.setTags(role.getTags());
        descriptor.setSalary(role.getSalary());
        descriptor.setDeadline(role.getDeadline());
        descriptor.setExperience(role.getExperience());
    }

    /**
     * Sets the {@code Name} of the {@code EditRoleDescriptor} that we are building.
     */
    public EditRoleDescriptorBuilder withName(String name) {
        descriptor.setName(new Name(name));
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code EditRoleDescriptor} that we are building.
     */
    public EditRoleDescriptorBuilder withPhone(String phone) {
        descriptor.setPhone(new Phone(phone));
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code EditRoleDescriptor} that we are building.
     */
    public EditRoleDescriptorBuilder withEmail(String email) {
        descriptor.setEmail(new Email(email));
        return this;
    }

    /**
     * Sets the {@code Company} of the {@code EditRoleDescriptor} that we are building.
     */
    public EditRoleDescriptorBuilder withCompany(String company) {
        descriptor.setCompany(new Company(company));
        return this;
    }

    /**
     * Sets the {@code JobDescription} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditRoleDescriptorBuilder withJobDescription(String jd) {
        descriptor.setJobDescription(new JobDescription(jd));
        return this;
    }
    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code EditRoleDescriptor}
     * that we are building.
     */
    public EditRoleDescriptorBuilder withTags(String... tags) {
        Set<Tag> tagSet = Stream.of(tags).map(Tag::new).collect(Collectors.toSet());
        descriptor.setTags(tagSet);
        return this;
    }

    /**
     * Sets the {@code Salary} of the {@code EditRoleDescriptor} that we are building.
     */
    public EditRoleDescriptorBuilder withSalary(String salary) {
        descriptor.setSalary(new Salary(salary));
        return this;
    }

    /**
     * Sets the {@code Website} of the {@code EditRoleDescriptor} that we are building.
     */
    public EditRoleDescriptorBuilder withWebsite(String website) {
        descriptor.setWebsite(new Website(website));
        return this;
    }

    /**
     * Sets the {@code Deadline} of the {@code EditRoleDescriptor} that we are building.
     */
    public EditRoleDescriptorBuilder withDeadline(String deadline) {
        descriptor.setDeadline(new Deadline(deadline));
        return this;
    }

    /**
     * Sets the {@code Experience} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditRoleDescriptorBuilder withExperience(String experience) {
        descriptor.setExperience(new Experience(experience));
        return this;
    }

    public EditRoleDescriptor build() {
        return descriptor;
    }
}