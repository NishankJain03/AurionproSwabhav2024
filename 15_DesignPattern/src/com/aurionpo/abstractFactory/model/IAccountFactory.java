package com.aurionpo.abstractFactory.model;

import java.util.Scanner;

public interface IAccountFactory {
	IAccount makeAccount(Scanner scanner);
}
